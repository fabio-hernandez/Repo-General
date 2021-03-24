"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const usersController_1 = __importDefault(require("../controllers/usersController"));
class UsersRoutes {
    constructor() {
        this.router = express_1.Router();
        this.config();
    }
    config() {
        this.router.get('/', usersController_1.default.listusers);
        //this.router.get('/:id', gamesController.geutOne);
        this.router.post('/', usersController_1.default.createUser);
        //this.router.put('/:id', gamesController.update);
        //this.router.delete('/:id', gamesController.delete);
    }
}
exports.default = new UsersRoutes().router;
