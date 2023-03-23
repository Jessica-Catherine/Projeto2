import {Table} from 'react-bootstrap';

import styles from '../layout/Tabela.module.css';
import {AiFillDelete, AiFillEdit} from 'react-icons/ai';

function Tabela(){
    return(
        <Table className={styles.table} striped bordered hover>
                <thead>
                <tr>
                    <th>NOME</th>
                    <th>AUTOR</th>
                    <th>EDITORA</th>
                    <th>GENÊRO</th>
                    <th>DESCRIÇÃO</th>
                    <th>ANO DE PUBLICAÇÃO</th>
                    <th><AiFillDelete/></th>
                    <th><AiFillEdit/></th>
                </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Como eu era antes de você</td>
                        <td>Jojo Moyes</td>
                        <td>Intriseca</td>
                        <td>Romance</td>
                        <td>Ele morre</td>
                        <td>2020</td>
                        <td><AiFillDelete/></td>
                        <td><AiFillEdit/></td>
                    </tr>

                    <tr>
                        <td>Como eu era antes de você</td>
                        <td>Jojo Moyes</td>
                        <td>Intriseca</td>
                        <td>Romance</td>
                        <td>Ele morre</td>
                        <td>2020</td>
                        <td><AiFillDelete/></td>
                        <td><AiFillEdit/></td>
                    </tr>

                    <tr>
                        <td>Como eu era antes de você</td>
                        <td>Jojo Moyes</td>
                        <td>Intriseca</td>
                        <td>Romance</td>
                        <td>Ele morre</td>
                        <td>2020</td>
                        <td><AiFillDelete/></td>
                        <td><AiFillEdit/></td>
                    </tr>
                    
                    <tr>
                        <td>Como eu era antes de você</td>
                        <td>Jojo Moyes</td>
                        <td>Intriseca</td>
                        <td>Romance</td>
                        <td>Ele morre</td>
                        <td>2020</td>
                        <td><AiFillDelete/></td>
                        <td><AiFillEdit/></td>
                    </tr>
                    
                    <tr>
                        <td>Como eu era antes de você</td>
                        <td>Jojo Moyes</td>
                        <td>Intriseca</td>
                        <td>Romance</td>
                        <td>Ele morre</td>
                        <td>2020</td>
                        <td><AiFillDelete/></td>
                        <td><AiFillEdit/></td>
                    </tr>
                    
                </tbody>
            </Table>
    );
}

export default Tabela;