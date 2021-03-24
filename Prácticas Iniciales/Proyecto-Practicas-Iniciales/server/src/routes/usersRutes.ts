import express, { Router } from 'express';

import usersController from '../controllers/usersController';

class UsersRoutes {

    router: Router = Router();

    constructor() {
        this.config();
    }

    config() {
        
        this.router.get('/', usersController.listusers);
        //this.router.get('/:id', gamesController.geutOne);
        this.router.post('/', usersController.createUser);
        //this.router.put('/:id', gamesController.update);
        //this.router.delete('/:id', gamesController.delete);
    }

}

export default new UsersRoutes().router;

