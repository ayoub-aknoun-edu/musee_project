import React from 'react';
import Carousel from 'react-material-ui-carousel'
import { Box, Container, Grid, Card, CardMedia, CardContent, Typography } from '@mui/material'

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
const Carousal = (props) => {
    return (
        <Carousel indicators={3}>
            {arts.map((item, i) => <Item key={i} item={item} />)}
        </Carousel>
    )
}

function Item(props) {
    return (
        <Container sx={{ py: 5 }} maxWidth="lg">
        <Grid container spacing={2}>
            <Grid item key={props.item.key} xs={12} sm={6} md={4}>
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
                  image={props.item.img}
                  alt="random"
                />
                <CardContent sx={{ flexGrow: 1 }}>
                <Typography gutterBottom variant="h4" component="h2">
                    {props.item.title.toUpperCase()}
                  </Typography>
                  <Box sx={{
                    display: 'flex',
                    justifyContent:'space-between',
                    alignItems:'center',
                  }}>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.artistName}
                  </Typography>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.yearCreated}
                  </Typography>
                  </Box>
                  <Typography>
                    {props.item.disc.toLowerCase()}
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
            <Grid item key={props.item.key + 1} xs={12} sm={6} md={4}>
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
                  image={props.item.img}
                  alt="random"
                />
                <CardContent sx={{ flexGrow: 1 }}>
                <Typography gutterBottom variant="h4" component="h2">
                    {props.item.title.toUpperCase()}
                  </Typography>
                  <Box sx={{
                    display: 'flex',
                    justifyContent:'space-between',
                    alignItems:'center',
                  }}>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.artistName}
                  </Typography>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.yearCreated}
                  </Typography>
                  </Box>
                  <Typography>
                    {props.item.disc.toLowerCase()}
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
            <Grid item key={props.item.key} xs={12} sm={6} md={4}>
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
                  image={props.item.img}
                  alt="random"
                />
                <CardContent sx={{ flexGrow: 1 }}>
                <Typography gutterBottom variant="h4" component="h2">
                    {props.item.title.toUpperCase()}
                  </Typography>
                  <Box sx={{
                    display: 'flex',
                    justifyContent:'space-between',
                    alignItems:'center',
                  }}>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.artistName}
                  </Typography>
                  <Typography gutterBottom color="gray" variant="p" component="h2">
                    {props.item.yearCreated}
                  </Typography>
                  </Box>
                  <Typography>
                    {props.item.disc.toLowerCase()}
                  </Typography>
                </CardContent>
              </Card>
            </Grid>
        </Grid>
      </Container>
    )
}

export default Carousal;