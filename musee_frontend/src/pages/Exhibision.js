import React from "react";
import {
  Box,
  Button,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  Container,
  Grid,
  Typography,
} from "@mui/material";
import "../stylesheets/Events.css";
import Contact from "../components/Contact";
const Exhibition = () => {
  const upcomingExhibition = [
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
    {
      id: 6,
      name: "Demo Event6",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description: "Come see our special Event .",
    },
    {
      id: 7,
      name: "Demo Event7",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description: "Come see our special Event .",
    },
    {
      id: 8,
      name: "Demo Event8",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description: "Come see our special Event .",
    },
    {
      id: 9,
      name: "Demo Event9",
      date: "20//03//2023",
      img: "https://source.unsplash.com/random",
      time: "10:00am - 5:00pm",
      description: "Come see our special Event .",
    },
  ];
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
  ];
  return (
    <>
      <Box component={"div"} className={"bg_Image"}>
        <Box component={"div"} className={"over_lay"}>
          <Typography variant="h3" component="h2" color="#fff" fontWeight={700}>
            Upcoming Exhibition
          </Typography>
          <Typography variant="p" mt={3} textAlign={"justify"} color={"#fff"}>
            Lorem ipsum dolor sit amet, consectetur adipisicing, consectetur
            adipisicing elit. Quo fugit?
          </Typography>
        </Box>
      </Box>
      <Box
        component={"div"}
        sx={{
          pt: 8,
        }}
      >
        <Box
          component={"div"}
          sx={{
            textAlign: "center",
          }}
        >
          <Typography variant="h3" fontWeight={700}>
            Exhibition
          </Typography>
        </Box>
        <Container maxWidth="lg" sx={{ mt: 6 }}>
          <Grid container spacing={2}>
            {event.map((event) => (
              <Grid
                item
                key={event.id}
                lg={12}
                sx={{
                  display: "flex",
                  alignItems: "center",
                  justifyContent: "center",
                  flexDirection: "column",
                }}
              >
                <Card
                  sx={{
                    maxHeight: 300,
                    width: "100%",
                    display: "flex",
                    flexDirection: "row",
                    "&:hover": {
                      boxShadow: "0px 0px 10px 0px rgba(0,0,0,0.5)",
                    },
                  }}
                >
                  <CardMedia
                    component="img"
                    image={event.img}
                    alt="random"
                    sx={{
                      height: "100%",
                      maxWidth: "40%",
                      objectFit: "fill",
                    }}
                  />
                  <CardContent sx={{ flexGrow: 1, m: 1 }}>
                    <Typography gutterBottom variant="h3" component="h2">
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
                      <Typography gutterBottom variant="h5" component="p">
                        {event.date}
                      </Typography>
                      <Typography gutterBottom variant="h5" component="p">
                        {event.time}
                      </Typography>
                    </Box>
                    <Typography gutterBottom mt={1} variant="p" component="p">
                      {event.description}
                    </Typography>
                    <Button
                      variant="contained"
                      sx={{
                        color: "#fff",
                        fontWeight: 600,
                        mt: 5,
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
                      Read More
                    </Button>
                  </CardContent>
                </Card>
              </Grid>
            ))}
          </Grid>
        </Container>
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
            Checkout our upcoming Exhibition
          </Typography>
          <Typography variant="h6" pt={2} fontSize={15} color="gray">
            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhh
          </Typography>
        </Box>
        <Container maxWidth="lg" sx={{ mt: 6 }}>
          <Grid container spacing={2}>
            {upcomingExhibition.map((event) => (
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
                        maxHeight: 250,
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
                    <Typography gutterBottom mt={1} component="p">
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
                      Read More
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

export default Exhibition;
