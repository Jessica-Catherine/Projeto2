import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import Home from './components/pages/Home';
import Contato from './components/pages/Contato';

import Container from './components/layout/Container';
import NavBar from './components/layout/NavBar';
import Footer from './components/layout/Footer';

function App() {
  return (
    <Router>
      <NavBar/>
      <Container customClass="min_height" >
      <Routes>
          <Route exact path='/' element={<Home/>}></Route>
          <Route path='/contato' element={<Contato/>}></Route>
      </Routes>
      </Container>
      <Footer/>
    </Router>
  );
}

export default App;
