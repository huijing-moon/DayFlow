import axios from "axios";

const API = axios.create({
    baseURL: "http://localhost:9090/api",
});

export const login = (email, password) => {
    return API.post("/auth/login", {
        email,
        password,
    });
};