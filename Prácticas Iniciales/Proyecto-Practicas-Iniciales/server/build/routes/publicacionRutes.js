"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const publicController_1 = __importDefault(require("../controllers/publicController"));
class UsersRoutes {
    constructor() {
        this.router = express_1.Router();
        this.config();
    }
    config() {
        this.router.get('/', publicController_1.default.listado);
        this.router.get('/liscurso', publicController_1.default.listadoCurso);
        this.router.get('/liscate', publicController_1.default.listadoCate);
        this.router.get('/liscatecurso', publicController_1.default.listadoCateinCurso);
        //this.router.get('/:id', gamesController.geutOne);
        this.router.post('/', publicController_1.default.createPublicacion);
        this.router.get('/liscom/:idPublicacion', publicController_1.default.listadoComentario);
        this.router.post('/insercomen', publicController_1.default.createComen);
        //this.router.put('/:id', gamesController.update);
        //this.router.delete('/:id', gamesController.delete);
    }
}
exports.default = new UsersRoutes().router;
