import styles from './BarraDePesquisa.module.css';
import {FaSearch} from 'react-icons/fa';

import Container from '../layout/Container';

function BarraDePesquisa(){
    return(
        <div className={styles.barra}>
             <input type='search' placeholder="Buscar Livros"/>
             <FaSearch/>
        </div>

    );
}

export default BarraDePesquisa;