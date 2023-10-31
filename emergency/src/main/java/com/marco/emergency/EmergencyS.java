package com.marco.emergency;

import java.util.List;

public interface EmergencyS {
    Emergency addEmergency(Emergency e);
    Emergency editEmergency(Emergency e);
    Emergency getEmById(int id);
    List<Emergency> getAllEmergencies();
    void deleteEm(int id);
}
