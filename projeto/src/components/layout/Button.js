import styles from '../layout/Button.module.css';

import Container from '../layout/Container';

function Button(){

    return(
        <Container>
        <div className={styles.button}>
        <input type='submit' value='Novo' className={styles.button1}/>
        </div>
        </Container>
    );

}

export default Button;