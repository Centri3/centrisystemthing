// hypothetical blue dwarf star
Star    "Kond/Lercurnis B"
{
    ParentBody "Lercurnis system bar"
    Class      "A9VI"
    MassSol     0.08
    RadSol      0.11
    Temperature 6460
    // this is probably wrong but SE generates wronger values
    Lum         0.25
    LumBol      0.25
    Age         4570

	RotationPeriod  144
	Obliquity       8.5639
	EqAscendNode    2.6806

    Surface
    {
		climatePole     0.45
		climateTropic   0
		mareFreq        10
		mareDensity     0.01
		hillsMagn       0
		hillsFreq       50
		TempMapMaxTemp  85000
    }

	Corona
	{
		Radius      3.9975e+05
		Period      0.032615
		Brightness  0.6
		RayDensity  3.1898
		RayCurv     6.0553
	}

    Orbit
    {
        RefPlane        "Equator"
        Period			20.7063094
        SemiMajorAxis   6.3
        ArgOfPericenter	180
        MeanAnomaly     0
    }
}
