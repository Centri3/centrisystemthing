DwarfMoon	"Bors III/Lercurnis B VII B-III"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            0.000110000001
	Radius          326.109985
	InertiaMoment   0.398119986
	Oblateness     (0.220, 0.330, 0.000)
	RotationPeriod  6.4671
	RotationEpoch   1451545
	Obliquity       6
	EqAscendNode    -2.7481

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_iii.cfg"
		SurfStyle       0.349
		Randomize      (0.892, -0.021, -0.256)
		colorDistMagn   0.0489
		colorDistFreq   37.4
		detailScale     32
		drivenDarkening 0
		seaLevel        0.168
		snowLevel       2
		tropicLatitude  0.000175
		icecapLatitude  2
		icecapHeight    0.659
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.277
		heightTempGrad  0.625
		beachWidth      0.00039
		tropicWidth     0.07
		mainFreq        1.07
		venusFreq       1.14
		venusMagn       0.916
		mareFreq        1
		mareDensity     0.115
		terraceProb     0.278
		erosion         0
		montesMagn      0.0742
		montesFreq      15.8
		montesSpiky     0.999
		montesFraction  0.11
		dunesMagn       0.0296
		dunesFreq       3.7
		dunesFraction   0.0616
		hillsMagn       0.109
		hillsFreq       35.8
		hillsFraction   0.447
		hills2Fraction  0
		riversMagn      60.5
		riversFreq      3.22
		riversSin       6.99
		riftsMagn       54.8
		riftsFreq       2.81
		riftsSin        6.42
		eqridgeMagn     0.328
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  3.36
		canyonsMagn     0.553
		canyonsFreq     0.101
		canyonsFraction 0.74
		cracksMagn      0.0385
		cracksFreq      0.154
		cracksOctaves   0
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.229
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.0458
		volcanoTemp     3e+03
		lavaCoverTidal  1
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      42.3
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.321
		RoughnessIce    0.267
		SpecularScale   0.565
		RoughnessBias   0.611
		RoughnessScale  1.27
		Hapke           0.382
		SpotBright      4.12
		SpotWidth       0.0107
		SpotBrightCB    8.7
		DayAmbient      0.07
		TempMapMaxTemp  1e+05
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.673651454
		SemiMajorAxisKm 237438.412
		Eccentricity    0.335877863
		Inclination     6
		AscendingNode   -2.7480916
		ArgOfPericenter -52.2137405
		MeanAnomaly     124.607633
	}
}

