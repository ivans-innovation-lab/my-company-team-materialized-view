package com.idugalic.queryside.team.handler;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventsourcing.SequenceNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.idugalic.common.blog.event.BlogPostCreatedEvent;
import com.idugalic.queryside.team.domain.Team;
import com.idugalic.queryside.team.repository.TeamRepository;

/**
 * Event handlers
 *
 */
@ProcessingGroup("default")
@Component
public class TeamViewEventHandler {

    private static final Logger LOG = LoggerFactory.getLogger(TeamViewEventHandler.class);

    @Autowired
    private TeamRepository myAggregateRepository;

    @EventHandler
    public void handle(BlogPostCreatedEvent event, @SequenceNumber Long version) {
        LOG.info("TeamCreatedEvent: [{}] ", event.getId());
        myAggregateRepository.save(new Team(event, version));
    }
}
