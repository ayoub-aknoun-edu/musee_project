import React, { useState } from 'react';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Grid from '@mui/material/Grid';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import { styled } from '@mui/material/styles';
import InputBase from '@mui/material/InputBase';
import SearchIcon from '@mui/icons-material/Search';
import { Box } from '@mui/material';
import Contact from '../components/Contact';

const arts = [
  {
  uid: 1,
  title: 'dog',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 2,
  title: 'cat',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 3,
  title: 'human',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 4,
  title: 'human',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 5,
  title: 'street',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 6,
  title: 'flowers',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 7,
  title: 'flower',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 8,
  title: 'dog',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
  {
  uid: 9,
  title: 'cat',
  artistName: "Vincent van Gogh",
  yearCreated: "1889",
  img: 'https://source.unsplash.com/random',
  disc: 'Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign Lorem Ipusm Dollar sign',
},
]

const Search = styled('div')(({ theme }) => ({
  position: 'relative',
  width: 300,
  borderRadius: theme.shape.borderRadius,
  backgroundColor: '#1976D2',
  '&:hover': {
    backgroundColor: '#1976D2',
  },
  marginLeft: 0,
  [theme.breakpoints.up('sm')]: {
    marginLeft: theme.spacing(1),
    // width: 'auto',
  },
}));

const SearchIconWrapper = styled('div')(({ theme }) => ({
  padding: theme.spacing(0, 2),
  height: '100%',
  position: 'absolute',
  pointerEvents: 'none',
  display: 'flex',
  alignItems: 'center',
  justifyContent: 'center',
  color: 'white'
}));

const StyledInputBase = styled(InputBase)(({ theme }) => ({
  color: 'white',
  '& .MuiInputBase-input': {
    padding: theme.spacing(1, 1, 1, 0),
    // vertical padding + font size from searchIcon
    paddingLeft: `calc(1em + ${theme.spacing(4)})`,
    transition: theme.transitions.create('width'),
    width: '100%',
    [theme.breakpoints.up('sm')]: {
      width: '12ch',
      '&:focus': {
        width: '25ch',
      },
    },
  },
}));
const theme = createTheme();

export default function Artwork() {
  const [doc ,setDoc] = useState(arts);
  const handleSearch = (e) => {
    const updatedDoc = arts.filter((val, ind)=> {
      return val.title.toLowerCase().includes(e.target.value.toLowerCase())
    })
    setDoc(updatedDoc)
  }
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
      <Container sx={{
        mt:6,
        display: 'flex',
        alignItems:'center',
        justifyContent: 'space-between'
      }}>
        <Typography
          sx={{
            textAlign: 'flex-start',
            fontSize: '36px',
            fontWeight: 700,
            color: '#1976D2'
          }}
        >Artwork Gallary</Typography>
         <Search >
            <SearchIconWrapper>
              <SearchIcon />
            </SearchIconWrapper>
            <StyledInputBase
            onChange={(event) => handleSearch(event)}
              placeholder="Search…"
              inputProps={{ 'aria-label': 'search' }}
            />
          </Search>
      </Container>
      <Container sx={{ py: 5 }} maxWidth="lg">
        <Grid container spacing={2}>
          {doc.map((card) => (
            <Grid item key={card.uid} xs={12} sm={6} md={4}>
              <Card elevation={4}
                sx={{ 
                  height: '100%', 
                  display: 'flex', 
                  flexDirection: 'column',
                  '&:hover' : {
                    boxShadow: '0px 0px 20px 2px rgba(0,0,0,0.5)'
                  }
                }}
              >
                <CardMedia
                  component="img"
                  image={card.img}
                  alt="random"
                />
                <CardContent sx={{ flexGrow: 1 }}>
                <Typography gutterBottom variant="h4" component="h2">
                    {card.title.toUpperCase()}
                  </Typography>
                  <Box sx={{
                    display: 'flex',
                    justifyContent:'space-between',
                    alignItems:'center',
                  }}>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {card.artistName}
                  </Typography>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {card.yearCreated}
                  </Typography>
                  </Box>
                  <Typography>
                    {card.disc.toLowerCase()}
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Container>
      <Contact  />
    </ThemeProvider>
  );
}