import logo from './logo.svg';
import './App.css';
import {useEffect, useMemo, useState} from "react";
import {createTheme, ThemeProvider, useTheme} from "@mui/material";
import {deepOrange} from "@mui/material/colors";
import NavBar from "./views/NavBar";
import Main from "./views/Main";
import ColorModeContext from "./context/ColorModeContext";



function App() {
  const [clients, setClients] = useState([])
  const [mode, setMode] = useState('light')
  // fetch all clients
  useEffect(() => {
    fetch('/api/v1/clients')
        .then(res => res.json())
        .then(data => console.log(data))
        .catch(err => console.log(err));
  }, [])


  // Dark theme Code
  const colorMode = useMemo(
     () => ({
       toggleColorMode: () => {
         setMode((currNode) => (currNode === 'light' ? 'dark' : 'light'));
       },
     }),
     []
  );
  const theme = useMemo(
      () => createTheme({
        palette: {
          mode,
        },
      }),
      [mode],
  );
  // end dark theme code
  return (
      <ColorModeContext.Provider value={colorMode}>
          <ThemeProvider theme={theme}>
            <div className="App">
              <NavBar />
              <Main />
            </div>
          </ThemeProvider>
      </ColorModeContext.Provider>
  );
}

export default App;
