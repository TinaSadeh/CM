package com.tina.CM.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_email")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mail extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "c_sender")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "c_receiver")
    private User receiver;

    @Column(name = "c_title")
    private String title;

    @Column(name = "c_content")
    private String content;

    @Column(name = "c_create_date_and_time")
    @CreationTimestamp
    private Timestamp createDateAndTime;






}
