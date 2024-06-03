// Hypothetical blue dwarf star

Star    "Kond/Lercurnis B"
{
    ParentBody     "Fragmunt-Kond bar"
    Class          "A9VI"

    // Assuming mass loss plays a factor in the evolution of these late M stars, these properties
    // should be decently accurate. The evolutionary models (in the paper cited below) do not factor
    // this in, so we can use this as a catch-all.
    //
    // In particular, the radius of this star is higher than that predicted of a 0.12M☉, to account
    // for this we assume a mass loss of 0.03M☉±0.01M☉. The temperature is consistent with the tip
    // of the blue dwarf stage for a star that is 0.14M☉, and this gives it the correct and/or
    // preferred luminosity.
    //
    // Laughlin, G., Bodenheimer, P., & Adams, F. C. (1997). The end of the main sequence. Astrophysical Journal/the Astrophysical Journal, 482(1), 420–432. https://doi.org/10.1086/304125 

    MassSol         0.12
    RadSol          0.233
    Temperature     8460
    Lum             0.25
    LumBol          0.25

    Age             4570

	RotationPeriod  144
	Obliquity       8.5639
	EqAscendNode    2.6806

    Surface
    {
        colorDistMagn   1
        colorDistFreq   5
		climatePole     1
		climateTropic   0
    	climateSteppeMin 0.0992
		climateSteppeMax 0.359
		climateForestMin 0.42
		climateForestMax 0.282
		mareFreq        30
		mareDensity     0.0025
        montesFreq      50
        dunesMagn       0.5
		hillsMagn       0.1
		hillsFreq       50
        canyonsMagn     0.274
        cracksOctaves   5
		TempMapMaxTemp  85000
    }

    Atmosphere
    {
        Height      1000
        Bright      20
    }

	Corona
	{
		Radius      1.1e+06
		Period      0.032615
		Brightness  0.6
		RayDensity  4.8643
		RayCurv     10.728
	}

    Orbit
    {
        RefPlane        "Equator"
        SemiMajorAxis   6
        Inclination     0
        AscendingNode   0
        ArgOfPericenter	180
        MeanAnomaly     0
    }
}
