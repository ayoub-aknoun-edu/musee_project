import React from "react";
import {
  Box,
  Button,
  Card,
  CardContent,
  CardMedia,
  Grid,
  Typography,
  Container,
  CardActions,
} from "@mui/material";
import Contact from "../components/Contact";
import "../stylesheets/Home.css";

const Home = () => {
  const event = [
    {
      id: 1,
      name: "Demo Event1",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description:
        "Come see our special Event . Lorem Ipsum dollar sign that out of at me as if should coud Lorem Ipsum dollar sign that out of at me as if should coud",
    },
    {
      id: 2,
      name: "Demo Event2",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description:
        "Come see our special Event . Lorem Ipsum dollar sign that out of at me as if should coud Lorem Ipsum dollar sign that out of at me as if should coud",
    },
    {
      id: 3,
      name: "Demo Event3",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description:
        "Come see our special Event . Lorem Ipsum dollar sign that out of at me as if should coud Lorem Ipsum dollar sign that out of at me as if should coud",
    },
    {
      id: 4,
      name: "Demo Event4",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description:
        "Come see our special Event . Lorem Ipsum dollar sign that out of at me as if should coud Lorem Ipsum dollar sign that out of at me as if should coud",
    },
    {
      id: 5,
      name: "Demo Event 5",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description:
        "Come see our special Event . Lorem Ipsum dollar sign that out of at me as if should coud Lorem Ipsum dollar sign that out of at me as if should coud",
    },
    // {
    //   id: 1,
    //   name: "Demo Event6",
    //   date: "20//03//2023",
    //   img: "https://source.unsplash.com/random",
    //   time: "10:00am - 5:00pm",
    //   description: "Come see our special Event .",
    // },
    // {
    //   id: 1,
    //   name: "Demo Event7",
    //   date: "20//03//2023",
    //   img: "https://source.unsplash.com/random",
    //   time: "10:00am - 5:00pm",
    //   description: "Come see our special Event .",
    // },
    // {
    //   id: 1,
    //   name: "Demo Event8",
    //   date: "20//03//2023",
    //   img: "https://source.unsplash.com/random",
    //   time: "10:00am - 5:00pm",
    //   description: "Come see our special Event .",
    // },
    // {
    //   id: 1,
    //   name: "Demo Event9",
    //   date: "20//03//2023",
    //   img: "https://source.unsplash.com/random",
    //   time: "10:00am - 5:00pm",
    //   description: "Come see our special Event .",
    // },
  ];

  return (
    <>
      <Box component={"div"} className={"bgImage"}>
        <Box component={"div"} className={"overlay"}>
          <Typography variant="h3" component="h2" color="#fff" fontWeight={700}>
            Exhibition on Modern Era
          </Typography>
          <Typography
            variant="p"
            mt={2}
            fontSize={20}
            textAlign={"justify"}
            color={"#fff"}
          >
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quo fugit?
          </Typography>
          <Button
            variant="contained"
            sx={{
              color: "#fff",
              fontWeight: 600,
              mt: 3,
              border: "2px solid #1976D2",
              px: 4,
              py: 2,
              borderRadius: 0,
              "&:hover": {
                border: "2px solid #fff",
                backgroundColor: "transparent",
                color: "#fff",
              },
            }}
          >
            Get Started
          </Button>
        </Box>
      </Box>
      <Box
        component={"div"}
        sx={{
          pt: 10,
        }}
      >
        <Box
          component={"div"}
          sx={{
            textAlign: "center",
          }}
        >
          <Typography variant="h4" fontWeight={700}>
            Checkout our upcoming Events
          </Typography>
          <Typography variant="h6" pt={2} fontSize={15} color="gray">
            Bla Bla Bla Bla Bla
          </Typography>
        </Box>
        <Container maxWidth="xl" sx={{ mt: 6 }}>
          <Grid container spacing={2}>
            {event.map((event) => (
              <Grid item key={event.id} xs={12} sm={6} md={4}>
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
                  <Box>
                    <CardMedia
                      component="img"
                      image={event.img}
                      alt="random"
                      sx={{
                        maxHeight: 300,
                        objectFit: "fill",
                      }}
                    />
                  </Box>
                  <CardContent sx={{ flexGrow: 1 }}>
                    <Typography gutterBottom mt={1} variant="h5" component="h2">
                      {event.name}
                    </Typography>
                    <Box
                      sx={{
                        display: "flex",
                        justifyContent: "space-between",
                        alignItems: "center",
                        mt: 3,
                      }}
                    >
                      <Typography gutterBottom component="p">
                        {event.date}
                      </Typography>
                      <Typography gutterBottom component="p">
                        {event.time}
                      </Typography>
                    </Box>
                    <Typography gutterBottom mt={3} component="p">
                      {event.description}
                    </Typography>
                  </CardContent>
                  <CardActions>
                    <Button
                      variant="contained"
                      sx={{
                        color: "#fff",
                        fontWeight: 600,
                        m: 1,
                        border: "2px solid #1976D2",
                        px: 4,
                        py: 1,
                        borderRadius: 1,
                        "&:hover": {
                          border: "2px solid #1976D2",
                          backgroundColor: "transparent",
                          color: "#1976D2",
                        },
                      }}
                    >
                      Register
                    </Button>
                  </CardActions>
                </Card>
              </Grid>
            ))}
          </Grid>
        </Container>
      </Box>
      <Contact />
    </>
  );
};

export default Home;
