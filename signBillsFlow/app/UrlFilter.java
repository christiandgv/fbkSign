

    import javax.inject.Inject;

import play.filters.cors.CORSFilter;
import play.http.DefaultHttpFilters;

    public class UrlFilter extends DefaultHttpFilters {
        @Inject public UrlFilter(CORSFilter corsFilter) {
            super(corsFilter);
        }
    }