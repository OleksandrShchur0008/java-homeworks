package de.ait.TestLombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Slf4j
public class StudentLombok {

    private String firstName;

    private String secondName;

    public void getInfo(){
        log.info("Student name {}, Student surname {}.", firstName, secondName);
    }


}
