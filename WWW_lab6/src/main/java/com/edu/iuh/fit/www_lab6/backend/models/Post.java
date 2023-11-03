package com.edu.iuh.fit.www_lab6.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "post")
public class Post {
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
    private Post parent;
    @Column(name = "content", columnDefinition = "tinytext")
    private String content;
    @Column(name = "create_at", columnDefinition = "datetime(6)")
    private LocalDate createAt;
    @Column(name = "published_at", columnDefinition = "datetime(6)")
    private LocalDate publishedAt;
    @Column(name = "meta_title", columnDefinition = "varchar(100)")
    private String metaTitle;
    @Column(name = "published", columnDefinition = "bit(1)")
    private boolean published;
    @Column(name = "sumary", columnDefinition = "tinytext")
    private String sumary;
    @Column(name = "title", columnDefinition = "varchar(75)")
    private String title;
    @Column(name = "update_at", columnDefinition = "datetime(6)")
    private LocalDate updateAt;

    public Post() {
    }

    public Post(User author, Post parent, String content, LocalDate createAt, LocalDate publishedAt, String metaTitle, boolean published, String sumary, String title, LocalDate updateAt) {
        this.author = author;
        this.parent = parent;
        this.content = content;
        this.createAt = createAt;
        this.publishedAt = publishedAt;
        this.metaTitle = metaTitle;
        this.published = published;
        this.sumary = sumary;
        this.title = title;
        this.updateAt = updateAt;
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

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
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

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getSumary() {
        return sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author=" + author +
                ", parent=" + parent +
                ", content='" + content + '\'' +
                ", createAt=" + createAt +
                ", publishedAt=" + publishedAt +
                ", metaTitle='" + metaTitle + '\'' +
                ", published=" + published +
                ", sumary='" + sumary + '\'' +
                ", title='" + title + '\'' +
                ", updateAt=" + updateAt +
                '}';
    }
}
