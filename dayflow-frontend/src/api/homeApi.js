import axiosInstance from "./axiosInstance";

export const getHome = () => {
    return axiosInstance.get("/api/home");
};
