import React, { useState } from 'react';
import {
    Button,
    CssBaseline,
    TextField,
    Grid,
    Box,
    Typography,
    Container,
    Paper,
} from '@mui/material';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import ForgotPasswordImage from '../assets/images/forgot 1.PNG';
import {Link} from 'react-router-dom'
const theme = createTheme();

export default function SignUp() {
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
                    height: 600,
                    width: 500,
                    margin: "40px auto 0 auto"
                }}>
                <Container component="main" maxWidth="xs">
                    <CssBaseline />
                    <Box
                        sx={{
                            marginTop: 0,
                            display: 'flex',
                            flexDirection: 'column',
                            alignItems: 'center',
                        }}
                    >                       
                           <img width={300} height={300} src={ForgotPasswordImage} alt="ForgotPasswordImage" />
                        <Typography variant="h4">
                            Forgot Password
                        </Typography>
                        <Box component="form" noValidate onSubmit={handleSubmit} sx={{ mt: 3 }}>
                            <TextField
                                required
                                fullWidth
                                name="email"
                                label="Email"
                                type="email"
                                id="email"
                                autoComplete="email"
                                onChange={handleChange}
                            />
                            <Button
                                type="submit"
                                fullWidth
                                variant="contained"
                                sx={{
                                    mt: 3,
                                    mb: 2
                                }}
                            >
                                Rest Password
                            </Button>
                            <Grid container justifyContent="flex-end">
                                <Grid item>
                                    <Link to="/" variant="body2">
                                        Go to Sign in Page ?
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