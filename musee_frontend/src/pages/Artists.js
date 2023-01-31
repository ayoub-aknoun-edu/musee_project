import React, { useState } from "react";
import {
  Box,
  Card,
  CardContent,
  Grid,
  Typography,
  Container,
  InputBase,
  CardMedia,
} from "@mui/material";
import { createTheme, ThemeProvider, styled } from "@mui/material/styles";
import SearchIcon from "@mui/icons-material/Search";
import Contact from "../components/Contact";

const arts = [
  {
    uid: 1,
    name: "Simo",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 2,
    name: "Ana",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 3,
    name: "Hamid l7wat",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 4,
    name: "Saadia",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 5,
    name: "Mol 7anot",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 6,
    name: "Wld Jiran",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 7,
    name: "John Doe",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 8,
    name: "Dove John",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
  {
    uid: 9,
    name: "David John",
    birthYear: 1459,
    deathYear: 1509,
    img: "https://source.unsplash.com/random",
    disc: "Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign",
  },
];

const Search = styled("div")(({ theme }) => ({
  position: "relative",
  width: 300,
  borderRadius: theme.shape.borderRadius,
  backgroundColor: "#1976D2",
  "&:hover": {
    backgroundColor: "#1976D2",
  },
  marginLeft: 0,
  [theme.breakpoints.up("sm")]: {
    marginLeft: theme.spacing(1),
    // width: 'auto',
  },
}));

const SearchIconWrapper = styled("div")(({ theme }) => ({
  padding: theme.spacing(0, 2),
  height: "100%",
  position: "absolute",
  pointerEvents: "none",
  display: "flex",
  alignItems: "center",
  justifyContent: "center",
  color: "white",
}));

const StyledInputBase = styled(InputBase)(({ theme }) => ({
  color: "white",
  "& .MuiInputBase-input": {
    padding: theme.spacing(1, 1, 1, 0),
    // vertical padding + font size from searchIcon
    paddingLeft: `calc(1em + ${theme.spacing(4)})`,
    transition: theme.transitions.create("width"),
    width: "100%",
    [theme.breakpoints.up("sm")]: {
      width: "12ch",
      "&:focus": {
        width: "25ch",
      },
    },
  },
}));
const theme = createTheme();

export default function Artwork() {
  const [doc, setDoc] = useState(arts);
  const handleSearch = (e) => {
    const updatedDoc = arts.filter((val, ind) => {
      return val.name.toLowerCase().includes(e.target.value.toLowerCase());
    });
    setDoc(updatedDoc);
  };
  //   useEffect(() => {
  //     fetch('https://dummyjson.com/posts')
  //     .then((res) => {
  //       const data = res.json();
  //     })
  //     .catch((err) => {
  //       console.error(err);
  //     });
  // }, []);
  return (
    <ThemeProvider theme={theme}>
      <Container
        sx={{
          mt: 6,
          display: "flex",
          alignItems: "center",
          justifyContent: "space-between",
        }}
      >
        <Typography
          sx={{
            textAlign: "flex-start",
            fontSize: "36px",
            fontWeight: 700,
            color: "#1976D2",
          }}
        >
          Artists
        </Typography>
        <Search>
          <SearchIconWrapper>
            <SearchIcon />
          </SearchIconWrapper>
          <StyledInputBase
            onChange={(event) => handleSearch(event)}
            placeholder="Search…"
            inputProps={{ "aria-label": "search" }}
          />
        </Search>
      </Container>
      <Container sx={{ py: 5 }} maxWidth="lg">
        <Grid container spacing={2}>
          {doc.map((card) => (
            <Grid item key={card.uid} xs={12} sm={6} md={4}>
              <Card
                elevation={4}
                sx={{
                  height: "100%",
                  display: "flex",
                  flexDirection: "column",
                  "&:hover": {
                    boxShadow: "0px 0px 20px 2px rgba(0,0,0,0.5)",
                  },
                }}
              >
                <CardMedia
                  component="img"
                  image={card.img}
                  alt="random"
                  sx={{
                    maxHeight: 200,
                    objectFit: "cover",
                  }}
                />
                <CardContent sx={{ flexGrow: 1 }}>
                  <Box
                    sx={{
                      display: "flex",
                      justifyContent: "space-between",
                      alignItems: "center",
                    }}
                  >
                    <Typography gutterBottom variant="h5" component="h2">
                      {card.name.toUpperCase()}
                    </Typography>
                    <Box
                      sx={{
                        display: "flex",
                        justifyContent: "space-between",
                        alignItems: "center",
                      }}
                    >
                      <Typography
                        gutterBottom
                        color="gray"
                        variant="p"
                        component="p"
                        pb={1.5}
                      >
                        {card.birthYear} - {card.deathYear}
                      </Typography>
                    </Box>
                  </Box>
                  <Typography>{card.disc}</Typography>
                </CardContent>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Container>
      <Contact />
    </ThemeProvider>
  );
}
