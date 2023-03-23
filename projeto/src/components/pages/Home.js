
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import BarraDePesquisa from '../layout/BarraDePesquisa';
import Button from '../layout/Button';
import Tabela from '../layout/Tabela';
import Container from '../layout/Container';

function Home(){
    return(
        <Container>
            {/* <BarraDePesquisa/>
            <Button/> */}
            <Tabela/>
        </Container>
    );
 }

export default Home;