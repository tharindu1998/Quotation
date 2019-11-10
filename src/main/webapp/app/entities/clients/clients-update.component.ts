import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { IClients } from 'app/shared/model/clients.model';
import { ClientsService } from './clients.service';

@Component({
    selector: 'jhi-clients-update',
    templateUrl: './clients-update.component.html'
})
export class ClientsUpdateComponent implements OnInit {
    private _clients: IClients;
    isSaving: boolean;
    createdDp: any;

    constructor(private clientsService: ClientsService, private activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ clients }) => {
            this.clients = clients;
        });
    }

    previousState() {
        window.history.back();
    }

    save() {
        let regexp = new RegExp('^(?:19|20)?d{2}(?:[01235678]dd(?<!(?:000|500|36[7-9]|3[7-9]d|86[7-9]|8[7-9]d)))d{4}(?:[vVxX])$');

        if (regexp.test(this.clients.nicNumber)) {
            this.isSaving = true;
            if (this.clients.id !== undefined) {
                this.subscribeToSaveResponse(this.clientsService.update(this.clients));
            } else {
                this.subscribeToSaveResponse(this.clientsService.create(this.clients));
            }
        } else {
            alert('Please enter a valid NIC Number');
        }
    }

    private subscribeToSaveResponse(result: Observable<HttpResponse<IClients>>) {
        result.subscribe((res: HttpResponse<IClients>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
    }

    private onSaveSuccess() {
        this.isSaving = false;
        this.previousState();
    }

    private onSaveError() {
        this.isSaving = false;
    }
    get clients() {
        return this._clients;
    }

    set clients(clients: IClients) {
        this._clients = clients;
    }
}
