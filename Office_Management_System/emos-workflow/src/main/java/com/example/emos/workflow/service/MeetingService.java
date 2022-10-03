package com.example.emos.workflow.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface MeetingService {
    1public HashMap searchMeetingByInstanceId(String instanceId);

    1public HashMap searchMeetingByUUID(String uuid);

    1public Long searchRoomIdByUUID(String uuid);

    1public List<String> searchUserMeetingInMonth(HashMap param);

    1public void updateMeetingStatus(HashMap param);

    1public ArrayList<Integer> searchMeetingUnpresent(String uuid);

    1public int updateMeetingUnpresent(HashMap param);


}
