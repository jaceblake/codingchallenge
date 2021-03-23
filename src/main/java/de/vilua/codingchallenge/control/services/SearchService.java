package de.vilua.codingchallenge.control.services;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.model.Food;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Value("${fatsecret.apikey}")
    private String apiKey;

    @Value("${fatsecret.apisecret}")
    private String apiSecret;

    /**
     *
     * @param query ist suchbegriff
     * Gibt entsprechendes Objekt {@link CompactFood} als Liste zurück
     */
    public List<CompactFood> searchFoodItems(String query) {
        FatsecretService service = new FatsecretService(apiKey, apiSecret);
        Response<CompactFood> response = service.searchFoods(query);
        List<CompactFood> results = response.getResults();
        return results;
    }

    /**
     *
     * @param id ist Food Item ID
     * Gibt entsprechendes Objekt {@link Food} zurück
     */
    public Food getFoodItem(Long id) {
        FatsecretService service = new FatsecretService(apiKey, apiSecret);
        return service.getFood(id);
    }

}
