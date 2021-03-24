"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const databaseconect_1 = __importDefault(require("../databaseconect"));
/*status = 1, todo ok
    status = -1, error
*/
const databaseconect_2 = __importDefault(require("../databaseconect"));
class UsersController {
    index(req, res) {
        databaseconect_1.default.query('DESCRIBE Usuario');
        res.json('users');
    }
    listusers(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const games = yield databaseconect_1.default.query('SELECT * FROM usuario');
            res.json(games);
        });
    }
    createUser(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { Carnet, Nombres, Apellidos, constrasenia, correo } = req.body;
            var sql = "INSERT INTO Usuario (Carnet, Nombres, Apellidos, constrasenia, correo) VALUES (?, ?, ?, ?, ?)";
            //console.log("req.body", req.body)
            //console.log("Carnet", Carnet)
            //console.log("Nombres", Nombres)
            //console.log("Apellidos", Apellidos)
            /*var sql = "INSERT INTO Usuario set ?";*/
            /*const result = await base_con.query(sql, [Carnet, Nombres, Apellidos, constrasenia, correo]);
            res.json({ message: 'usuario ingresado' });
    
            console.log("result", result)
            res.status(404).json({ result: "Ya existe usuario con el mismo nombre" });*/
            try {
                const result = yield databaseconect_2.default.query(sql, [Carnet, Nombres, Apellidos, constrasenia, correo]);
                res.json({ status: 1, message: 'usuario ingresado' });
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
}
const usersController = new UsersController;
exports.default = usersController;
