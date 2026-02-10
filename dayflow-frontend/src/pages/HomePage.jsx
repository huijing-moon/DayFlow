import { useEffect, useState } from "react";
import { getHome } from "../api/homeApi";
import axiosInstance from "../api/axiosInstance";

function HomePage() {
  const [home, setHome] = useState(null);

    useEffect(() => {
        axiosInstance.get("/api/home")
            .then(res => setHome(res.data))
            .catch(err => console.error(err));
    }, []);

  if (!home) return <div>로딩중...</div>;

  return (

      <div>
          <h2>홈</h2>
          <p>오늘요약</p>
          <p>날짜</p>
          <p>습관달성률</p>
          <p>기록개수</p>


          <h2>습관리스트</h2>
          <p>습관이름</p>
          <p>오늘 체크여부</p>
          <p>연속달성일</p>
         
      </div>
    // <div>
    //   <h2>{home.date} 홈</h2>
    //   <p>
    //     습관 완료율: {home.habitSummary.achievementRate}%
    //   </p>
    //
    //   <ul>
    //     {home.todayHabits.map((h) => (
    //       <li key={h.habitId}>
    //         {h.name} {h.checked ? "✅" : "⬜"} (연속 {h.streak})
    //       </li>
    //     ))}
    //   </ul>
    // </div>
  );
}

export default HomePage;
