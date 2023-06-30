DwarfMoon	"Bors II/Lercurnis B VII B-II"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.00012
	Radius          335.12
	InertiaMoment   0.39942
	Obliquity       1
	EqAscendNode    -178.63
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_ii.cfg"
		SurfStyle       0.91332
		Randomize      (-0.223, 0.915, 0.410)
		colorDistMagn   0.073034
		colorDistFreq   45.26
		detailScale     1024
		drivenDarkening 0
		seaLevel        0.16137
		snowLevel       2
		tropicLatitude  0.017452
		icecapLatitude  2
		icecapHeight    0.65254
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33263
		heightTempGrad  0.625
		beachWidth      0.0010248
		tropicWidth     0.07
		mainFreq        2.0839
		venusFreq       0.72852
		venusMagn       0
		mareFreq        0
		mareDensity     0.142
		terraceProb     0.41155
		erosion         0
		montesMagn      0.06328
		montesFreq      13.739
		montesSpiky     0.82305
		montesFraction  0.9904
		dunesMagn       0.026571
		dunesFreq       2.4434
		dunesFraction   0.068347
		hillsMagn       0.12453
		hillsFreq       43.894
		hillsFraction   0.048361
		hills2Fraction  0
		riversMagn      60.72
		riversFreq      4.1344
		riversSin       5.6304
		riftsMagn       60.912
		riftsFreq       2.6024
		riftsSin        5.979
		canyonsMagn     0.47105
		canyonsFreq     0.097228
		canyonsFraction 0.10415
		cracksMagn      0.044491
		cracksFreq      0.20825
		cracksOctaves   0
		craterMagn      0.79241
		craterFreq      1.2461
		craterDensity   0.98443
		craterOctaves   16
		craterRayedFactor 0
		volcanoMagn     0.19318
		volcanoFreq     0.69432
		volcanoDensity  0.20231
		volcanoOctaves  3
		volcanoActivity 0.024804
		volcanoFlows    0.22075
		volcanoRadius   0.14984
		volcanoTemp     273.53
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.756
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.55830576
		SemiMajorAxisKm 1391609.21
		Eccentricity    0.12
		Inclination     -2
		AscendingNode   8.24427481
		ArgOfPericenter 173.129771
		MeanAnomaly     107.175573
	}
}

