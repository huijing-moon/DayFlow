import axios from "axios";

const API = axios.create({
    baseURL: "http://localhost:9090/api",
});

API.interceptors.request.use((config) => {
    const token = localStorage.getItem("accessToken");
    if (token) {
        config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
});

export const getHome = () => API.get("/home");
