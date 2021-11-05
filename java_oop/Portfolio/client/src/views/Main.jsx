import {Box} from "@mui/material";

function Main(){
    const theme = useTheme()
    return (
        <Box className={'main-div'} sx={{height: '100%'}}>
            <p>Hi</p>
        </Box>
    );
}

export default Main