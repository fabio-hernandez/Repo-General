import express, { Router } from 'express';

import publicController from '../controllers/publicController';

class UsersRoutes {

    router: Router = Router();

    constructor() {
        this.config();
    }

    config() {
        
        this.router.get('/', publicController.listado);
        this.router.get('/liscurso', publicController.listadoCurso);
        this.router.get('/liscate', publicController.listadoCate);
        this.router.get('/liscatecurso', publicController.listadoCateinCurso);
        //this.router.get('/:id', gamesController.geutOne);
        this.router.post('/', publicController.createPublicacion);

        this.router.get('/liscom/:idPublicacion', publicController.listadoComentario);
        this.router.post('/insercomen', publicController.createComen);

        //this.router.put('/:id', gamesController.update);
        //this.router.delete('/:id', gamesController.delete);
    }

}

export default new UsersRoutes().router;

