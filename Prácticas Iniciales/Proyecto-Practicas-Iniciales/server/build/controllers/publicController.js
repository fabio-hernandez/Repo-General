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
    listadoCurso(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            try {
                const result = yield databaseconect_1.default.query('SELECT * FROM curso');
                //res.json({ status: 1, message: 'usuario ingresado' });
                res.json(result);
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    listadoCate(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            try {
                const result = yield databaseconect_1.default.query('SELECT * FROM catedratico');
                //res.json({ status: 1, message: 'usuario ingresado' });
                res.json(result);
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    listadoCateinCurso(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            try {
                const result = yield databaseconect_1.default.query('SELECT * FROM Catedratico_en_Curso');
                //res.json({ status: 1, message: 'usuario ingresado' });
                res.json(result);
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    listadoComentario(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { idPublicacion } = req.params;
            console.log("idPublicacion", idPublicacion);
            try {
                const result = yield databaseconect_1.default.query('SELECT * FROM Comentario WHERE idPublicacion = ?', [idPublicacion]);
                //res.json({ status: 1, message: 'usuario ingresado' });
                res.json(result);
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    /* public async getOne(req: Request, res: Response): Promise<any> {
         const { id } = req.params;
         const games = await pool.query('SELECT * FROM games WHERE id = ?', [id]);
         console.log(games.length);
         if (games.length > 0) {
             return res.json(games[0]);
         }
         res.status(404).json({ text: "The game doesn't exits" });
     }*/
    listado(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            try {
                const result = yield databaseconect_1.default.query('SELECT * FROM Publicacion order by fecha desc');
                //res.json({ status: 1, message: 'usuario ingresado' });
                res.json(result);
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
            //const games = await pool.query('SELECT * FROM usuario');
            //res.json(games);
        });
    }
    createPublicacion(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { Mensaje, Carnet, fecha, idCatedraticoCurso, idCurso, idCatedratico, Tipo } = req.body;
            var sql = "INSERT INTO Publicacion (Mensaje,Carnet, fecha, idCatedraticoCurso,idCurso, idCatedratico, Tipo) VALUES\
         (?, ?, ?, ?, ?, ?, ?)";
            try {
                const result = yield databaseconect_2.default.query(sql, [Mensaje, Carnet, fecha, idCatedraticoCurso, idCurso, idCatedratico, Tipo]);
                res.json({ status: 1, message: 'publicacion ingresada' });
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    createComen(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { Comentario, idPublicacion, Carnet } = req.body;
            var sql = "INSERT INTO Comentario (Comentario,idPublicacion, Carnet) VALUES\
         (?, ?, ?)";
            try {
                const result = yield databaseconect_2.default.query(sql, [Comentario, idPublicacion, Carnet]);
                res.json({ status: 1, message: 'comentario ingresado' });
            }
            catch (err) {
                res.status(404).json({ status: -1, error: err.sqlMessage });
                // handle errors here
            }
        });
    }
    createUser(req, res) {
        return __awaiter(this, void 0, void 0, function* () {
            const { Carnet, Nombres, Apellidos, constrasenia, correo } = req.body;
            var sql = "INSERT INTO Usuario (Carnet, Nombres, Apellidos, constrasenia, correo) VALUES (?, ?, ?, ?, ?)";
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
