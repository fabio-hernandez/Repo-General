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


    public async listusers(req: Request, res: Response): Promise<void> {
        const games = await pool.query('SELECT * FROM usuario');
        res.json(games);
    }

    public async createUser(req: Request, res: Response): Promise<void> {
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