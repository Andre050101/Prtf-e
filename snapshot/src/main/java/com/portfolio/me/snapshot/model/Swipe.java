package com.portfolio.me.snapshot.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "swipes", uniqueConstraints = @UniqueConstraint(columnNames = { "user_id", "project_id" }))
public class Swipe {

    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relazioni
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SwipeType action;

    @CreationTimestamp
    @Column(name = "swiped_at", updatable = false)
    private LocalDateTime swipedAt;

    // Enum per tipo di swipe
    public enum SwipeType {
        LIKE, PASS, SUPER_LIKE
    }

    // Constructors
    public Swipe() {
    }

    public Swipe(User user, Project project, SwipeType action) {
        this.user = user;
        this.project = project;
        this.action = action;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public SwipeType getAction() {
        return action;
    }

    public void setAction(SwipeType action) {
        this.action = action;
    }

    public LocalDateTime getSwipedAt() {
        return swipedAt;
    }

    public void setSwipedAt(LocalDateTime swipedAt) {
        this.swipedAt = swipedAt;
    }

}
