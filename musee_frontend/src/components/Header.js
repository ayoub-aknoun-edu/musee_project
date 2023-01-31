import React, { useState } from "react";
import {
  AppBar,
  Box,
  Toolbar,
  IconButton,
  Typography,
  Menu,
  Container,
  Button,
  MenuItem,
} from "@mui/material";
import MenuIcon from "@mui/icons-material/Menu";
import AdbIcon from "@mui/icons-material/Adb";
import { Link, useNavigate } from "react-router-dom";

const pages = ["Home", "Events", "Exhibitions", "ArtWork", "Artists"];
const rightPages = ["SignIn", "SignUp"];
const menuPages = [
  "Home",
  "Events",
  "Exhibitions",
  "ArtWork",
  "Artists",
  "SignIn",
  "SignUp",
];
const Header = () => {
  const push = useNavigate();
  const [anchorElNav, setAnchorElNav] = useState(null);

  const handleOpenNavMenu = (event) => {
    setAnchorElNav(event.currentTarget);
  };

  const handleCloseNavMenu = () => {
    setAnchorElNav(null);
  };

  return (
    <AppBar position="sticky">
      <Container maxWidth="xl">
        <Toolbar disableGutters>
          <AdbIcon sx={{ display: { xs: "none", md: "flex" }, mr: 1 }} />
          <Typography
            variant="h6"
            noWrap
            component="a"
            onClick={() => push("/")}
            sx={{
              mr: 2,
              display: { xs: "none", md: "flex" },
              fontFamily: "monospace",
              fontWeight: 700,
              letterSpacing: ".3rem",
              color: "inherit",
              textDecoration: "none",
            }}
          >
            MyMuseum
          </Typography>
          <Box sx={{ flexGrow: 1, display: { xs: "flex", md: "none" } }}>
            <IconButton
              size="large"
              aria-label="account of current user"
              aria-controls="menu-appbar"
              aria-haspopup="true"
              onClick={handleOpenNavMenu}
              color="inherit"
            >
              <MenuIcon />
            </IconButton>
            <Menu
              id="menu-appbar"
              anchorEl={anchorElNav}
              anchorOrigin={{
                vertical: "bottom",
                horizontal: "right",
              }}
              keepMounted
              transformOrigin={{
                vertical: "top",
                horizontal: "right",
              }}
              open={Boolean(anchorElNav)}
              onClose={handleCloseNavMenu}
              sx={{
                display: { xs: "block", md: "none" },
              }}
            >
              {menuPages.map((page) => (
                <MenuItem key={page} onClick={handleCloseNavMenu}>
                  <Typography textAlign="center">
                    <Link
                      to={`/${page}`}
                      style={{
                        textDecoration: "none",
                      }}
                    >
                      {page}
                    </Link>
                  </Typography>
                </MenuItem>
              ))}
            </Menu>
          </Box>
          <AdbIcon sx={{ display: { xs: "flex", md: "none" }, mr: 1 }} />
          <Typography
            variant="h5"
            noWrap
            component="a"
            href=""
            sx={{
              mr: 2,
              display: { xs: "flex", md: "none" },
              flexGrow: 1,
              fontFamily: "monospace",
              fontWeight: 700,
              letterSpacing: ".3rem",
              color: "inherit",
              textDecoration: "none",
            }}
          >
            LOGO
          </Typography>
          <Box
            sx={{
              flexGrow: 2,
              display: { xs: "none", md: "flex" },
              justifyContent: "center",
            }}
          >
            {pages.map((page) => (
              <Link
                to={`/${page}`}
                style={{
                  textDecoration: "none",
                }}
              >
                <Button
                  key={page}
                  onClick={handleCloseNavMenu}
                  sx={{
                    color: "white",
                    display: "block",
                    mx: 2,
                    px: 3,
                    py: 2,
                    "&:hover": {
                      backgroundColor: "rgba(0,0,0,0.1)",
                    },
                  }}
                >
                  {page}
                </Button>
              </Link>
            ))}
          </Box>
          <Box
            sx={{
              flexGrow: 0,
              display: { xs: "none", md: "flex" },
              justifyContent: "flex-end",
            }}
          >
            {rightPages.map((page) => (
              <Link
                to={`/${page}`}
                style={{
                  textDecoration: "none",
                }}
              >
                <Button
                  key={page}
                  onClick={handleCloseNavMenu}
                  sx={{
                    color: "white",
                    display: "block",
                    mx: 2,
                    px: 3,
                    py: 2,
                    "&:hover": {
                      backgroundColor: "rgba(0,0,0,0.1)",
                    },
                  }}
                >
                  {page}
                </Button>
              </Link>
            ))}
          </Box>
        </Toolbar>
      </Container>
    </AppBar>
  );
};
export default Header;
