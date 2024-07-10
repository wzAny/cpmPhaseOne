package com.incture.cpm.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assignment {
    @Id
    private int assignmentId;
    @Column
    private  String assignmentWeek;
    @Column
    private String assignmentName;
    @Column
    private String assignmentTechnology;
    @Column
    private String assignmentDuedate;
    @Column
    private int assignmentScore;
    @Column
    private String assignmentFileName;
    @Column
    private String assignmentStatus;
    @Column
    private String assignmentFileUrl;
    @Column
    private String assignedTo;
    @Column
    private int maxmarks;
    @Column
    private String mentorAssigned;
}
