import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import {createTheme, ThemeProvider} from "@mui/material";
import {deepOrange} from "@mui/material/colors";
import NavBar from "./views/NavBar";
const theme = createTheme({
  status: {
    danger: deepOrange[500],
  }
});
function App() {
  const [clients, setClients] = useState([])
  useEffect(() => {
    fetch('/api/v1/clients')
        .then(res => res.json())
        .then(data => console.log(data))
        .catch(err => console.log(err));
  })
  return (
      <ThemeProvider theme={theme}>
        <div className="App">
          <NavBar/>
        </div>
      </ThemeProvider>
  );
}

export default App;
