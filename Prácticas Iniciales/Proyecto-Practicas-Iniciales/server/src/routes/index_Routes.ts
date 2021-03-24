import { Router } from 'express';

import { indexController } from '../controllers/indexController';

class Index_Routes {

    public router: Router = Router();

    constructor() {
        this.config();
    }

    config(): void {
        this.router.get('/', indexController.index);
    }

}

const indexRoutes = new Index_Routes();
export default indexRoutes.router;