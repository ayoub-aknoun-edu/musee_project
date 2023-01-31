import React from "react";
import HomeRoundedIcon from "@mui/icons-material/HomeRounded";
import LocalPhoneRoundedIcon from "@mui/icons-material/LocalPhoneRounded";
import MailRoundedIcon from "@mui/icons-material/MailRounded";
import {
  Box,
  Button,
  Container,
  Grid,
  TextField,
  Typography,
} from "@mui/material";

const Contact = () => {
  return (
    <>
      <Box
        component={"div"}
        sx={{
          textAlign: "center",
          mt: 10,
          mb: 10,
        }}
      >
        <Typography variant="h4" fontWeight={700}>
          Contact us
        </Typography>
        <Typography variant="h6" pt={2} fontSize={15} color="gray">
          Bla matsoni rah maghadich njawbok
        </Typography>
      </Box>
      <Box
        sx={{
          backgroundColor: "whitesmoke",
          height: "55vh",
        }}
      >
        <Container maxWidth="lg" sx={{ mt: 6 }}>
          <Grid container spacing={3}>
            <Grid item xs={12} sm={6} md={4}>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <Box>
                  <HomeRoundedIcon
                    sx={{
                      color: "#1976D2",
                      fontSize: 60,
                    }}
                  />
                </Box>
                <Box
                  sx={{
                    ml: 4,
                  }}
                >
                  <Typography variant="h6" color="#1976D2">
                    City Name, Country Name
                  </Typography>
                  <Typography variant="p">Home Address</Typography>
                </Box>
              </Box>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <Box>
                  <LocalPhoneRoundedIcon
                    sx={{
                      color: "#1976D2",
                      fontSize: 45,
                    }}
                  />
                </Box>
                <Box
                  sx={{
                    ml: 5,
                  }}
                >
                  <Typography variant="h5" color="#1976D2">
                    00 (000) 1234 567
                  </Typography>
                  <Typography variant="p">Open on the February 31th</Typography>
                </Box>
              </Box>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <Box>
                  <MailRoundedIcon
                    sx={{
                      color: "#1976D2",
                      fontSize: 45,
                    }}
                  />
                </Box>
                <Box
                  sx={{
                    ml: 5,
                  }}
                >
                  <Typography variant="h6" color="#1976D2" fontWeight="500">
                    support@gmail.com
                  </Typography>
                  <Typography variant="p">Get in touch!</Typography>
                </Box>
              </Box>
            </Grid>
            <Grid item xs={12} sm={6} md={4}>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <TextField
                  fullWidth
                  label="Name"
                  placeholder="Enter your name"
                  variant="outlined"
                />
              </Box>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <TextField
                  fullWidth
                  label="Email"
                  placeholder="Enter email address"
                  variant="outlined"
                />
              </Box>
              <Box
                sx={{
                  display: "flex",
                  alighItems: "center",
                  mt: 5,
                }}
              >
                <TextField
                  fullWidth
                  label="Subject"
                  placeholder="Enter your subject"
                  variant="outlined"
                />
              </Box>
            </Grid>
            <Grid item xs={12} sm={6} md={4}>
              <Box
                sx={{
                  display: "flex",
                  mt: 5,
                  ml: 4,
                }}
              >
                <TextField fullWidth placeholder="Message" multiline rows={9} />
              </Box>
              <Box
                sx={{
                  display: "flex",
                  justifyContent: "flex-end",
                  alignItems: "center",
                  mt: 1,
                }}
              >
                <Button
                  variant="contained"
                  sx={{
                    color: "#fff",
                    fontWeight: 600,
                    m: 1,
                    border: "1px solid #1976D2",
                    px: 5,
                    py: 1,
                    borderRadius: 1,
                    "&:hover": {
                      border: "1px solid #1976D2",
                      backgroundColor: "transparent",
                      color: "#1976D2",
                    },
                  }}
                >
                  Send Message
                </Button>
              </Box>
            </Grid>
          </Grid>
        </Container>
      </Box>
    </>
  );
};

export default Contact;
