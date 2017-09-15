package com.idugalic.queryside.team.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import com.idugalic.common.blog.event.BlogPostCreatedEvent;
import com.idugalic.common.blog.model.BlogPostCategory;

/**
 * A JPA entity. It represents materialized view
 *
 */
@Entity
public class Team {

    @Id
    private String id;

    @Version
    private Long version;

    private Long aggregateVersion;

    private String authorId;

    public Team() {
    }

    public Team(String id, Long aggregateVersion, String title, String rawContent, String renderContent, String publicSlug, Boolean draft, Boolean broadcast, Date publishAt, BlogPostCategory category, String authorId) {
        super();
        this.id = id;
        this.aggregateVersion = aggregateVersion;
        this.authorId = authorId;
    }

    public Team(BlogPostCreatedEvent event, Long aggregateVersion) {
        super();
        this.id = event.getId();
        this.authorId = event.getAuthorId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Long getVersion() {
        return aggregateVersion;
    }

    public void setVersion(Long version) {
        this.aggregateVersion = version;
    }

    public Long getAggregateVersion() {
        return aggregateVersion;
    }

    public void setAggregateVersion(Long aggregateVersion) {
        this.aggregateVersion = aggregateVersion;
    }
}
