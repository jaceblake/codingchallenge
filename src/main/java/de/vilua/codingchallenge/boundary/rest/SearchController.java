package de.vilua.codingchallenge.boundary.rest;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.model.Food;
import de.vilua.codingchallenge.control.services.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/vilua-codingchallenge/v1")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping(path = "/search-food-items", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<CompactFood> searchItems(@RequestParam(value="query") String query) {
        return this.searchService.searchFoodItems(query);
    }

    @GetMapping(path = "/search-food", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Food item(@RequestParam(value="id") Long id) {
        return this.searchService.getFoodItem(id);
    }

}
