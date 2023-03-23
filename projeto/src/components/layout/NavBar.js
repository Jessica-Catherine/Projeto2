import{Link} from 'react-router-dom';

import Container from './Container';

import styles from './NavBar.module.css';
import logo from '../../img/logo.png';

function NavBar(){
    return(
      <nav className={styles.navBar}>
        <div className={styles.logo}>
            <Link to="/">
                <img src={logo} alt="Universo dos livros" />
            </Link>
        </div>
        <ul className={styles.list}>
              <li className={styles.item}><Link to="/">Home</Link></li>
              <li className={styles.item}><Link to="/contato">Contato</Link></li>
        </ul>
      </nav>
    );
}

export default NavBar;