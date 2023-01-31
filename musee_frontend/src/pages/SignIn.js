import React, { useState } from 'react';
import { Paper, 
  Avatar, 
  Button, 
  CssBaseline, 
  TextField, 
  FormControlLabel, 
  Checkbox,
  Grid,
  Box,
  Typography,
  Container
 } from '@mui/material';
 import {Link} from 'react-router-dom'
import LockOutlinedIcon from '@mui/icons-material/LockOutlined';
import { createTheme, ThemeProvider } from '@mui/material/styles';


const theme = createTheme();

export default function SignIn() {
  
  const initialState = { email: "", password: "" }
  
  const [state, setState] = useState(initialState)

  const handleChange = e => {
    setState(s => ({ ...s, [e.target.name]: [e.target.value] }))
  }
  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(state);
    
  };
  return (
    <ThemeProvider theme={theme}>
      <Paper elevation={10}
        style={{
          padding: 20,
          height: 560,
          width: 500,
          margin: "40px auto 0 auto"
        }}>
        <Container component="main" maxWidth="xs"  >
          <CssBaseline />
          <Box
            sx={{
              marginTop: 2,
              display: 'flex',
              flexDirection: 'column',
              alignItems: 'center',
            }}
          >
            <Avatar sx={{ backgroundColor: '#1976D2', width: 84, height: 84, m: 3 }}>
              <LockOutlinedIcon sx={{ fontSize: '50px' }} />
            </Avatar>
            <Typography variant="h4">
              SIGN IN
            </Typography>
            <Box component="form" onSubmit={handleSubmit} noValidate sx={{ mt: 1 }}>
              <TextField
                margin="normal"
                required
                fullWidth
                id="email"
                label="Email Address"
                name="email"
                autoComplete="email"
                autoFocus
                onChange={handleChange}
              />
              <TextField
                margin="normal"
                required
                fullWidth
                name="password"
                label="Password"
                type="password"
                id="password"
                autoComplete="current-password"
                onChange={handleChange}
              />
              <FormControlLabel
                control={<Checkbox value="remember" color="primary" />}
                label="Remember me"
              />
              <Button
                type="submit"
                fullWidth
                variant="contained"
                sx={{ 
                  mt: 2,
                  mb: 3,
                  p: 2, 
                  fontSize: 17, 
                  fontWeight: 600 
                }}
              >
                Sign In
              </Button>
              <Grid container mb={2}>
                <Grid item xs>
                  <Link to="/forgotpassword" variant="body2">
                    Forgot password?
                  </Link>
                </Grid>
                <Grid item>
                  <Link to="/signup" variant="body2">
                    {"Don't have an account? Sign Up"}
                  </Link>
                </Grid>
              </Grid>
            </Box>
          </Box>
        </Container>
      </Paper>
    </ThemeProvider>
  );
}