package com.edu.iuh.fit.www_lab6.backend.models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "post_comment")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    //@Column(name = "author_id", columnDefinition = "bigint(20)")
    private User author;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    //@Column(name = "parent_id", columnDefinition = "bigint(20)")
    private PostComment parent;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    //@Column(name = "post_id", columnDefinition = "bigint(20)")
    private Post post;
    @Column(name = "content", columnDefinition = "tinytext")
    private String content;
    @Column(name = "create_at", columnDefinition = "datetime(6)")
    private LocalDate createAt;
    @Column(name = "published_at", columnDefinition = "datetime(6)")
    private LocalDate publishedAt;
    @Column(name = "published", columnDefinition = "bit(1)")
    private boolean published;
    @Column(name = "title", columnDefinition = "varchar(75)")
    private String title;

    public PostComment() {
    }

    public PostComment(User author, PostComment parent, Post post, String content, LocalDate createAt, LocalDate publishedAt, boolean published, String title) {
        this.author = author;
        this.parent = parent;
        this.post = post;
        this.content = content;
        this.createAt = createAt;
        this.publishedAt = publishedAt;
        this.published = published;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public PostComment getParent() {
        return parent;
    }

    public void setParent(PostComment parent) {
        this.parent = parent;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", author=" + author +
                ", parent=" + parent +
                ", post=" + post +
                ", content='" + content + '\'' +
                ", createAt=" + createAt +
                ", publishedAt=" + publishedAt +
                ", published=" + published +
                ", title='" + title + '\'' +
                '}';
    }
}
