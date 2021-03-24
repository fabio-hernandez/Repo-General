import { Request, Response } from 'express';
import pool from '../databaseconect';


/*status = 1, todo ok
    status = -1, error
*/

import base_con from '../databaseconect';

class UsersController {

    public index(req: Request, res: Response) {
        pool.query('DESCRIBE Usuario')
        res.json('users')
    }

    public async listadoCurso(req: Request, res: Response): Promise<void> {

        try {
            const result = await pool.query('SELECT * FROM curso');
            //res.json({ status: 1, message: 'usuario ingresado' });
            res.json(result);
          } catch (err) {
            res.status(404).json({ status: -1, error: err.sqlMessage });
            // handle errors here
          }
    }

    public async listadoCate(req: Request, res: Response): Promise<void> {

        try {
            const result = await pool.query('SELECT * FROM catedratico');
            //res.json({ status: 1, message: 'usuario ingresado' });
            res.json(result);
          } catch (err) {
            res.status(404).json({ status: -1, error: err.sqlMessage });
            // handle errors here
          }
    }
    
    public async listadoCateinCurso(req: Request, res: Response): Promise<void> {

        try {
            const result = await pool.query('SELECT * FROM Catedratico_en_Curso');
            //res.json({ status: 1, message: 'usuario ingresado' });
            res.json(result);
          } catch (err) {
            res.status(404).json({ status: -1, error: err.sqlMessage });
            // handle errors here
          }
    }
    
    public async listadoComentario(req: Request, res: Response): Promise<any> {
        const { idPublicacion } = req.params;
        console.log("idPublicacion", idPublicacion)
        try {
            const result = await pool.query('SELECT * FROM Comentario WHERE idPublicacion = ?', [idPublicacion]);
            //res.json({ status: 1, message: 'usuario ingresado' });
            res.json(result);
          } catch (err) {
            res.status(404).json({ status: -1, error: err.sqlMessage });
            // handle errors here
          }
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

    public async listado(req: Request, res: Response): Promise<void> {

        try {
            const result = await pool.query('SELECT * FROM Publicacion order by fecha desc');
            //res.json({ status: 1, message: 'usuario ingresado' });
            res.json(result);
          } catch (err) {
            res.status(404).json({ status: -1, error: err.sqlMessage });
            // handle errors here
          }

        //const games = await pool.query('SELECT * FROM usuario');
        //res.json(games);
    }

    public async createPublicacion(req: Request, res: Response): Promise<void> {
        const { Mensaje,Carnet, fecha, idCatedraticoCurso,idCurso, idCatedratico, Tipo } = req.body;
        var sql = "INSERT INTO Publicacion (Mensaje,Carnet, fecha, idCatedraticoCurso,idCurso, idCatedratico, Tipo) VALUES\
         (?, ?, ?, ?, ?, ?, ?)";

    try {
        const result = await base_con.query(sql, [Mensaje,Carnet, fecha, idCatedraticoCurso,idCurso, idCatedratico, Tipo] );
        res.json({ status: 1, message: 'publicacion ingresada' });
      } catch (err) {
        res.status(404).json({ status: -1, error: err.sqlMessage });
        // handle errors here
      }

    }

    public async createComen(req: Request, res: Response): Promise<void> {
        const { Comentario,idPublicacion, Carnet } = req.body;
        var sql = "INSERT INTO Comentario (Comentario,idPublicacion, Carnet) VALUES\
         (?, ?, ?)";

    try {
        const result = await base_con.query(sql, [Comentario,idPublicacion, Carnet] );
        res.json({ status: 1, message: 'comentario ingresado' });
      } catch (err) {
        res.status(404).json({ status: -1, error: err.sqlMessage });
        // handle errors here
      }

    }

    public async createUser(req: Request, res: Response): Promise<void> {
        const { Carnet, Nombres, Apellidos, constrasenia, correo } = req.body;
        var sql = "INSERT INTO Usuario (Carnet, Nombres, Apellidos, constrasenia, correo) VALUES (?, ?, ?, ?, ?)";

    try {
        const result = await base_con.query(sql, [Carnet, Nombres, Apellidos, constrasenia, correo] );
        res.json({ status: 1, message: 'usuario ingresado' });
      } catch (err) {
        res.status(404).json({ status: -1, error: err.sqlMessage });
        // handle errors here
      }

    }
}

const usersController = new UsersController;
export default usersController;