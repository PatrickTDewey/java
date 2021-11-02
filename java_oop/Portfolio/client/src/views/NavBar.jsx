import {AppBar, Box, IconButton, Menu, MenuItem, Toolbar, Typography} from "@mui/material";
import {DarkMode, GitHub, MenuBook, MenuRounded, More, PictureAsPdfRounded} from "@mui/icons-material";
import {useRef, useState} from "react";


const NavBar = () => {
    const [anchorEl, setAnchorEl] = useState(null);
    const [mobileMoreAnchorEl, setMobileMoreAnchorEl] = useState(null);

    const isMenuOpen = Boolean(anchorEl);
    const isMobileMenuOpen = Boolean(mobileMoreAnchorEl);

    const anchorRef = useRef();

    const handleMobileMenuClose = () => {
        setMobileMoreAnchorEl(null);
    }

    const handleMenuClose = () => {
        setAnchorEl(null);
        handleMobileMenuClose();
    }

    const handleMenuOpen = (e) => {
        setAnchorEl(anchorRef.current)
    }

    const handleMobileMenuOpen = (event) => {
        setMobileMoreAnchorEl(event.currentTarget);

    }
    const menuId = 'primary-menu';
    const renderMenu = (
        <Menu
            anchorEl={anchorEl}
            anchorOrigin={{
                vertical: 'top',
                horizontal: 'left',
            }}
            id={menuId}
            keepMounted
            transformOrigin={{
                vertical: 'top',
                horizontal: 'left',
            }}
            open={isMenuOpen}
            onClose={handleMenuClose}
        >
            <MenuItem onClick={handleMenuClose}>About Me</MenuItem>
            <MenuItem onClick={handleMenuClose}>Projects</MenuItem>
            <MenuItem onClick={handleMenuClose}>Contact</MenuItem>
        </Menu>
    );

    const mobileMenuId = 'primary-icon-menu-mobile'
    const renderMobileMenu = (
        <Menu
            anchorEl={mobileMoreAnchorEl}

            anchorOrigin={{
                vertical: 'top',
                horizontal:'right'
            }}
            id={mobileMenuId}
            keepMounted
            transformOrigin={{
                vertical: 'top',
                horizontal: 'right'
            }}
            sx={{display:{ md:'none'}}}
            open={isMobileMenuOpen}
            onClose={handleMobileMenuClose}
        >
            <MenuItem onClick={handleMobileMenuClose}>
                <IconButton
                    size={"large"}
                    color={"inherit"}
                    aria-label={"GitHub Icon"}

                >
                    <GitHub/>
                </IconButton>
                <p>GitHub</p>
            </MenuItem>
            <MenuItem onClick={handleMobileMenuClose}>
                <IconButton
                    size={"large"}
                    color={"inherit"}
                    aria-label={"Resume Icon"}

                >
                    <PictureAsPdfRounded/>
                </IconButton>
                <p>Resume</p>
            </MenuItem>
            <MenuItem onClick={handleMobileMenuClose}>
                <IconButton
                    size={"medium"}
                    color={"inherit"}
                    aria-label={"Dark Mode Icon"}

                >
                    <DarkMode/>
                </IconButton>
                <p>Dark Mode</p>
            </MenuItem>
        </Menu>
    );
    return (
        <Box sx={{flexGrow: 1}}>
            <AppBar enableColorOnDark={true} position={"static"}>
                <Toolbar>
                    <IconButton
                        size={"large"}
                        edge={"start"}
                        color={"inherit"}
                        aria-label={"menu"}
                        sx={{mr:2}}
                        ref={anchorRef}
                        onClick={handleMenuOpen}
                        >
                        <MenuRounded/>
                    </IconButton>
                    <Typography variant={ "h5" } component={ "div" } sx={{ flexGrow: 1 }}>
                        Patrick Dewey
                    </Typography>
                    <Box sx={{ display: { xs: 'none', md: 'flex', alignItems:"center", justifyContent: "space-around" } }}>
                        <IconButton
                            size={"large"}
                            edge={"start"}
                            color={"inherit"}
                            aria-label={"GitHub Icon"}
                        >
                            <GitHub/>
                        </IconButton>

                        <IconButton
                            size={"large"}
                            edge={"start"}
                            color={"inherit"}
                            aria-label={"Resume Icon"}

                        >
                            <PictureAsPdfRounded/>
                        </IconButton>

                        <IconButton
                            size={"medium"}
                            edge={"start"}
                            color={"inherit"}
                            aria-label={"Dark Mode Icon"}

                        >
                            <DarkMode/>
                        </IconButton>
                    </Box>
                    <Box sx={{display: {xs: "flex", md: 'none'}}}>
                        <IconButton
                            size={"large"}
                            aria-label={"show more"}
                            aria-controls={mobileMenuId}
                            aria-haspopup={"true"}
                            onClick={handleMobileMenuOpen}
                            color={"inherit"}
                            >
                            <More/>
                        </IconButton>
                    </Box>
                </Toolbar>
            </AppBar>
            {renderMenu}
            {renderMobileMenu}
        </Box>
    )
}
export default NavBar;