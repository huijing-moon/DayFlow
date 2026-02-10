package com.huijing.dayflow.domain.habit;

import com.huijing.dayflow.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "habit")
public class Habit {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long habitId;

    private String habitName;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HabitType habitType;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public enum HabitType {
        DAILY, WEEKLY, MONTHLY
    }


}
