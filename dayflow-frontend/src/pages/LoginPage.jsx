import { useState } from "react";
import { login } from "../api/authApi";
import { useNavigate } from "react-router-dom";

function LoginPage() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const navigate = useNavigate();

    const handleLogin = async () => {
        try {
            const res = await login(email, password);
            localStorage.setItem("accessToken", res.data.accessToken);
            navigate("/home");
        } catch (e) {
            alert("로그인 실패");
        }
    };

    return (
        <div>
            <h2>로그인</h2>
            <input
                placeholder="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
            />
            <br />
            <input
                type="password"
                placeholder="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />
            <br />
            <button onClick={handleLogin}>로그인</button>
        </div>
    );
}

export default LoginPage;
