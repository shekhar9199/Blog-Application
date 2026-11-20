import axios from "axios";

const API = "YOUR_API_KEY"; // Spring Backend Api Key

export const getPosts = () => axios.get(`${API}/getAll`);
export const getPost = (id) => axios.get(`${API}/${id}`);
export const createPost = (data) => axios.post(`${API}/create`, data);
export const updatePost = (id, data) => axios.put(`${API}/update/${id}`, data);
export const deletePost = (id) => axios.delete(`${API}/delete/${id}`);
